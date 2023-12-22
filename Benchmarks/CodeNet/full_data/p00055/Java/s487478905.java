import java.util.Scanner;
class Main {
public static void main(String...args){
Scanner in = new Scanner(System.in);
while(in.hasNext()) {
double[] s = new double[10];
double ans = 0.0;
double a=in.nextDouble();
d[0]=a;
for(int i=1;i<10;i++){
if(i%2!=0) s[i]=s[i-1]*2;
else s[i]=s[i-1]/3;
ans+=s[i];
}
System.out.println(ans);
}
}
}