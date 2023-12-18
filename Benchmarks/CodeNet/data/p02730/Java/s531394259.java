import java.util.Scanner;

public class Main {

    boolean check1(String str) {
        int n = str.length();
        int i = 0, j = n - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
    return true;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int flag=0;
       Main ob1=new Main();
            if(ob1.check1(str)){
                if (n==3 || ob1.check1(str.substring(0,((n-1)/2))))
                    if (n==3 || ob1.check1(str.substring((n+3/2)-2,n)))
                       flag=1;

            }
            if(flag==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
