import java.util.Scanner;

class AddProg {
    public static void main(String args[]) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);


        a = sc.nextInt();


        b = sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int values[] = {add,sub,mul};
        int max =values[0];
        if(-1000<=a&a<=1000&-1000<=b&b<=1000){
           for (int index = 1; index < values.length; index ++) {
            max = Math.max(max, values[index]);
        }

        }
        System.out.println(max);

    }
}