import java.util.*;
class Main{
public static void main(String[] args){
int[] m=new int[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<m.length;i++){
m[i]=sc.nextInt();
}
Arrays.sort(m);
for(int i=1;i<=3;i++){
System.out.println(m[10-i]);
}
}
}