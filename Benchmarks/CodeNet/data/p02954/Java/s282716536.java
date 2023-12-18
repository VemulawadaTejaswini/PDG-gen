

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String S=gs();
        List<Integer> rs=new ArrayList<Integer>();
        List<Integer> ls=new ArrayList<Integer>();
        int[] ans=new int[S.length()];

        rs.add(0);
        for (int i=1;i<S.length();i++) {
            char bc=S.charAt(i-1);
            char nc=S.charAt(i);
            if(bc=='L' && nc=='R') {
                rs.add(i);
            } else if(bc=='R' && nc=='L') {
                ls.add(i);
            }
        }

        for (int i=0;i<rs.size();i++) {
            int s=rs.get(i);
            int e=S.length();
            if(i+1<rs.size()) e=rs.get(i+1);
            int m=ls.get(i);
            int num=e-s;
            if(num%2==0) {
            	ans[m-1]=num/2;
            	ans[m]=num/2;
            } else {
            	if((m-s)%2==1) {
            		ans[m-1]=Math.floorDiv(num, 2)+1;
            		ans[m]=Math.floorDiv(num, 2);
            	} else {
            		ans[m-1]=Math.floorDiv(num, 2);
            		ans[m]=Math.floorDiv(num, 2)+1;
            	}
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<S.length();i++) {
            if(i!=0)sb.append(" ");
            sb.append(ans[i]);
        }

        System.out.println(sb);
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}