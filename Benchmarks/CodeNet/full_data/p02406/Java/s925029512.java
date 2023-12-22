import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=n;i++)
{
    if(i%3==0 || String.valueOf(i).indexOf('3')>=0)
        System.out.print(" " + i);
}
System.out.println();
}
}