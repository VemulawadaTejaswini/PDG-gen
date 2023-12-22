import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int n=scan.nextInt();
            int r=scan.nextInt();
            if(n==0 && r==0){
                break;
            }
            ArrayList list=new ArrayList();
            for (int i=0;i<n;i++){
                list.add(n-i);
            }
            for (int i=0;i<r;i++){
                int p=scan.nextInt();
                int c=scan.nextInt();
                for (int j=0;j<c;j++){
                    int temp= (int) list.get(p-1+j);
                    list.remove(p-1+j);
                    list.add(0+j,temp);
                }
            }
            System.out.println(list.get(0));
        }
    }
}
