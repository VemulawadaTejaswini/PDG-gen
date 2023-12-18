import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        String s[]={"1","2","3","4","5","6","7","8","9"};
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k=Integer.parseInt(line);
        int a=0;
        for(int i=0;i<k;i++){
            if(i!=0){
                System.out.println();
            }
            int n=i;
            System.out.print(s[i%9]);
            while(n>=9){
                System.out.print("9");
                n-=9;
            }
        }
        System.out.println();
    }
}