import java.util.ArrayList;
import java.util.Scanner;

class M1129 {
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
//                for(int j=0;j<list.size();j++){
//                    System.out.print(list.get(j)+" ");
//                }
//                System.out.println("");
                int p=scan.nextInt();
                int c=scan.nextInt();
                for (int j=0;j<c;j++){
                    //data[p-1+j],data[0+j]
                    int temp= (int) list.get(p-1+j);
                    list.remove(p-1+j);
                    list.add(0+j,temp);
                }
            }
            System.out.println(list.get(0));
        }
    }
}
