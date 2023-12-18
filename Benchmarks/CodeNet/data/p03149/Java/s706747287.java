import java.util.*;
class Solution
{
public static void main(String[] args)
{
Scanner jk = new Scanner(System.in);
int n1 = jk.nextInt();
int n2 = jk.nextInt();
int n3 = jk.nextInt();
int n4 = jk.nextInt();
if (n1==1 || n1==9 || n1==7 || n1==4)
{
if (n2==1 || n2==9 || n2==7 || n2==4)
{
if (n3==1 || n3==9 || n3==7 || n3==4)
{
if (n4==1 || n4==9 || n4==7 || n4==4)
{System.out.println("YES");}
else{System.out.println("NO");}
}
else{System.out.println("NO");}
}
else{System.out.println("NO");}
}
else{System.out.println("NO");}
}
}