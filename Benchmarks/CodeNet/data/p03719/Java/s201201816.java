import java.util.*;

 class abc
{

public void show(int a,int b,int c)
{
    if((c>=a) && (c<=b))
    System.out.print("Yes");
    else 
    System.out.print("No");
}
public static void main(String[] args)
{Scanner read = new Scanner(System.in);
    abc obj=new abc();
obj.show(read.nextInt(),read.nextInt(),read.nextInt());
}
}