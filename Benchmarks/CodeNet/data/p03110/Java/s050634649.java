import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for(int i=0;i<n;i++){
            String a=sc.next();
            String u=sc.next();
            if(u.equals("JPY")){
                int a_ = Integer.parseInt(a);
                total+=a_;
            }else{
                double a_=Double.parseDouble(a);
                total+=a_*380000.0;

            }
        }
        System.out.println(total);
    }

}