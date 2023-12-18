import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[]s=line.split(" ",0);
        int n[]=new int[3];
        for(int i=0;i<3;i++){
            n[i]=Integer.parseInt(s[i]);
        }
        if((n[1]-n[0]+1)/2<=n[2])
        for(int i=n[0];i<n[1];i++){
            System.out.println(i);
        }
        else{
        for(int i=n[0];i<=n[0]+n[2];i++){
            System.out.println(i);
        }
        for(int i=n[1]-n[2]+1;i<=n[1];i++){
            System.out.println(i);
        }}
        
    }
}