import java.util.*;

public class Main {

  public static void main(String[] args) {

  	Map<Integer, String> map = new HashMap<>();

    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);

    int sunuke_value = scanner.nextInt();
    int okashi_kind = scanner.nextInt();

    while (scanner.hasNextLine()) {
        int sunuke_has = scanner.nextInt();
        scanner.nextLine();
    	String okashi_has = scanner.nextLine();
    	map.put(sunuke_has, okashi_has);
    }

    System.out.println(sunuke_value - map.keySet().size());

  }

}