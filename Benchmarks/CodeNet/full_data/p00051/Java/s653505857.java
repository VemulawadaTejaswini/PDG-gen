import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
 	int n=sc.nextInt();
    int a[]=new int[8];
 for(int i=0;i<n;i++){
String s[]=sc.next().split("");
for(int j=0;j<8;j++){
	a[j]=Integer.parseInt(s[j]);
}
Arrays.sort(a);
int max=0;
int min=0;
int c=1;
for(int j=0;j<8;j++){
	max+= a[j]*c;
	min+= a[7-j]*c;
	c*=10;
}
System.out.println(max-min);
        }
      }
    }
}