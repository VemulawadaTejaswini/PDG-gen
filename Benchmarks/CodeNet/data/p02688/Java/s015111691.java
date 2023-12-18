import java.util.*;

public class Main {

  public static void main(String[] args) {

  	Map<Integer, String> map = new HashMap<>();

    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);

    int sunuke_value = scanner.nextInt();
    int okashi_kind = scanner.nextInt();

    while (sc.hasNextLine()) {
    	int sunuke_has = scanner.nextInt();
    	int okashi_has = scanner.next();
    	map.put(sunuke_has, okashi_has);
    }

    System.out.println(sunuke_value - map.keySet().size());

  }

}