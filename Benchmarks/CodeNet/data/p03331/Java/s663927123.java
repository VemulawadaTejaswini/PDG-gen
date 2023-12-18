import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
        String[] array = line.split("");
        
        int arrayLength = array.length;
        int ans = 0;

        
        for(int i = 0; i < arrayLength; i++){
        	ans += Integer.parseInt(array[i]);
        
        }
        System.out.println(ans);

	}

}
