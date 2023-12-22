import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	//System.out.println("数字を入力してください");
    	Scanner sc = new Scanner(System.in);
    	int i = Integer.parseInt(sc.next());

    	int h=i/3600;
    	int a=i%3600;
    	int m=a/60;
    	int s=a%60;
    	System.out.println(h+":"+m+":"+s);
    }
}

