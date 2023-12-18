import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> Aslist = divisor(A);
        List<Integer>Bslist = divisor(B);
        Aslist.addAll(Bslist);
        Collections.sort(Aslist);
        List<Integer>Clist=new ArrayList<>();
        for(int i = 0; i < Aslist.size()-1; i++){
            Integer s = Aslist.get(i);
            if(s==Aslist.get(i+1)){
                Clist.add(s);
            }
        }
        List<Integer>Dlist=new ArrayList<>();
        Clist.forEach(s->{
            if(s==2||s%2!=0){
                Dlist.add(s);
                System.out.println(s);
            }
        });

        List<Integer> FinalList = new ArrayList<>();

        boolean test=false;
        for(int i = 0;i<Dlist.size();i++){
            for(int j =i+1;j<Dlist.size();j++){
                if(gcd(Dlist.get(i),Dlist.get(j))!=1){
                    if(i!=Dlist.size()) {
                        if(i!=Dlist.size()) {
                            test = true;
                            break;
                        }
                    }
                }
            }
            if(!test){
                FinalList.add(Dlist.get(i));
            }
            test=false;
        }

//        for(int i = 0;i<FinalList.size();i++){
//            System.out.print(FinalList.get(i)+" ");
//        }
        System.out.println(FinalList.size());
    }

    public static final List<Integer> divisor(final int n) {
        final List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {    //√n
            if (n % i == 0) {
                list.add(i);          //a x b
                if (i != n / i) {
                    list.add(n / i);  //b x a (逆向き)
                }
            }
        }
        return list;
    }
    static int gcd (Integer a, Integer b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        //System.out.println("gcd : "+b);
        return b;
    }
}
