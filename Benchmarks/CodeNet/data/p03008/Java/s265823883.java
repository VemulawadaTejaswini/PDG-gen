import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static int goldA;
  private static int silvA;
  private static int brnzA;
  private static int goldB;
  private static int silvB;
  private static int brnzB;

  private static class Asset {

    int acrn;
    int gold;
    int silv;
    int brnz;

    Asset() {
    }

    Asset(Asset copy) {
      this.acrn = copy.acrn;
      this.gold = copy.gold;
      this.silv = copy.silv;
      this.brnz = copy.brnz;
    }
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    int n = sc.nextInt();

    goldA = sc.nextInt();
    silvA = sc.nextInt();
    brnzA = sc.nextInt();

    goldB = sc.nextInt();
    silvB = sc.nextInt();
    brnzB = sc.nextInt();

    // convert all assets to money. value is measured by B market, weight is measured By A market
    int acornFirst = n;
    Asset first = convertToMoney(acornFirst, goldA, silvA, brnzA, Main::acornValAtB);

    int acornSecond = acornValAtB(first);
    Asset second = convertToMoney(acornSecond, goldB, silvB, brnzB, Main::acornValAtA);

    os.println(acornValAtA(second));
  }

  // knapsack
  private static Asset convertToMoney(int acorn, int goldWeight, int silvWeight, int brnzWeight, Function<Asset, Integer> evaluator) {
    Asset[] dp = new Asset[acorn + 1];
    dp[0] = new Asset();

    for (int i = 0; i < acorn; i++) {
      Asset current = dp[i];

      if (i + 1 <= acorn) {
        Asset acrn = new Asset(current);
        acrn.acrn++;
        if (dp[i + 1] == null) {
          dp[i + 1] = acrn;
        } else {
          int exst = evaluator.apply(dp[i + 1]);int cand = evaluator.apply(acrn);
          if (cand > exst) dp[i + 1] = acrn;
        }
      }

      // gold
      if (i + goldWeight <= acorn) {
        Asset gold = new Asset(current);
        gold.gold++;
        if (dp[i + goldWeight] == null) {
          dp[i + goldWeight] = gold;
        } else {
          int exst = evaluator.apply(dp[i + goldWeight]);int cand = evaluator.apply(gold);
          if (cand > exst) dp[i + goldWeight] = gold;
        }
      }

      // silver
      if (i + silvWeight <= acorn) {
        Asset silv = new Asset(current);
        silv.silv++;
        if (dp[i + silvWeight] == null) {
          dp[i + silvWeight] = silv;
        } else {
          int exst = evaluator.apply(dp[i + silvWeight]);int cand = evaluator.apply(silv);
          if (cand > exst) dp[i + silvWeight] = silv;
        }
      }

      // bronze
      if (i + brnzWeight <= acorn) {
        Asset brnz = new Asset(current);
        brnz.brnz++;
        if (dp[i + brnzWeight] == null) {
          dp[i + brnzWeight] = brnz;
        } else {
          int exst = evaluator.apply(dp[i + brnzWeight]);int cand = evaluator.apply(brnz);
          if (cand > exst) dp[i + brnzWeight] = brnz;
        }
      }
    }
    return dp[acorn];
  }

//  private static Asset greedyConvertAtB(Asset asset) {
//    Asset result = new Asset();
//    result.acrn = asset.acrn;
//
//    if (goldB > goldA) {
//      // convert now!
//      result.acrn += asset.gold * goldB;
//    } else {
//      result.gold = asset.gold;
//    }
//
//    if (silvB > silvA) {
//      // convert now!
//      result.acrn += asset.silv * silvB;
//    } else {
//      result.silv = asset.silv;
//    }
//
//    if (brnzB > brnzA) {
//      // convert now!
//      result.acrn += asset.brnz * brnzB;
//    } else {
//      result.brnz = asset.brnz;
//    }
//    return result;
//  }

  private static int acornValAtA(Asset asset) {
    return asset.acrn + asset.gold * goldA + asset.silv * silvA + asset.brnz * brnzA;
  }

  private static int acornValAtB(Asset asset) {
    return asset.acrn + asset.gold * goldB + asset.silv * silvB + asset.brnz * brnzB;
  }

}