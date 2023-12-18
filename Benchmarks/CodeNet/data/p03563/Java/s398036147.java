import java.util.Scanner;//导入Scanner模块，用于输入
public class Main {
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);//这样可以方便输入
        int a=scan.nextInt(),c=scan.nextInt();//输入a,c
        int b=(c<<1)-a;//由我们得到的关系式直接计算答案
        System.out.println(b);//输出b，一定要换行
    }
}