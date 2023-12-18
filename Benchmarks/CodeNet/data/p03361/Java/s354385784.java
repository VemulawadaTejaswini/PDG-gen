import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");

        int h = Integer.parseInt(s1[0]);
        int w = Integer.parseInt(s1[1]);

        String s[][] = new String[h][w];
        for (int i = 0;i < h;i++) {
        	String row = sc.nextLine();
        	for (int j = 0;j < w;j++) {
        		s[i][j]=String.valueOf(row.charAt(j));
        	}
        }

        String result="Yes";
        for (int i = 0;i < h;i++) {
        	for (int j = 0;j < w;j++) {
        		if (".".equals(s[i][j])) {

        		}
        		boolean flg=false;
        		//上
        		if (i != 0 && s[i][j].equals(s[i-1][j])) {
        			flg=true;
        		}
        		//下
        		if (i != h-1 && s[i][j].equals(s[i+1][j])) {
        			flg=true;
        		}
        		//左
        		if (j != 0 && s[i][j].equals(s[i][j-1])) {
        			flg=true;
        		}
        		//右
        		if (j != w-1 && s[i][j].equals(s[i][j+1])) {
        			flg=true;
        		}

        		if (flg==false) {
        			result="No";
        			System.out.println(i + " " +j);
        		}
        	}
        }

        System.out.println(result);
    }
}