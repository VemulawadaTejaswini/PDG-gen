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
{
    abc obj=new abc();
obj.show();
}
}