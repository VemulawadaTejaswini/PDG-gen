import java.util.Scanner;

public class Main {
    public int multiple(int l,int r,int d){
        int count=0;
        for (int i = l; i <= r; i++) {
            if (i%d==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        Main obj=new Main();
        while (tan.hasNext()){
            int l,r,d;
            l=tan.nextInt();
            r=tan.nextInt();
            d=tan.nextInt();
            int result=obj.multiple(l,r,d);
            System.out.println(result);
        }
    }
}
