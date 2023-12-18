import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
int []n=new int[2];
        n[0] = sc.nextInt();
n[1] = sc.nextInt();
int k = sc.nextInt();
for(int i=0;i<k;i++){
n[i%2]=n[i%2]/2;
n[(i+1)%2]+=n[i%2];
}
System.out.println(n[0]+" "+n[1]);
    }
}