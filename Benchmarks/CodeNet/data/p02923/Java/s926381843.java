import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int N=obj1.nextInt();
        int[] myarr = new int[N];
        int[] myarr1 = new int[N];
        for (int i=0;i<myarr.length;i++){
            myarr[i]=obj1.nextInt();
        }
            int count=0;
        for (int i=0;i<myarr.length-1;i++) {
            Fuck:
            for (int j = i + 1; j < myarr.length; j++) {
                if (j>N-1||(i+count)>N-1)
                    break;
                if (myarr[i+count] >= myarr[j]) {
                    myarr1[i]++;
                    count++;
                }
                else {
                    count=0;
                    break Fuck;
                }
            }
        }
            int x=myarr1[0];
            for (int i=0;i<myarr1.length;i++){
                if (myarr1[i]>x)
                  x=myarr1[i];
            }
        System.out.print(x);

    }
}