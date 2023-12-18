import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
line = sc.nextLine();
String s[]=line.split(" ",0);
int num=s.length;
int m[]=new int[num];
int ans=0;
for(int i=0;i<num;i++){
m[i]=Integer.parseInt(s[i]);
ans+=m[i];
}
ans*=2;
ans/=num;
ans/=2;
int an=0;
for(int i=0;i<num;i++){
an+=(m[i]-ans)*(m[i]-ans);
}
System.out.println(an);
}
}