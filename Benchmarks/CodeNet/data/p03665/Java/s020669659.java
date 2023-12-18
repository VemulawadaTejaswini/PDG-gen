
import java.util.Scanner;
import java.math.BigDecimal;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int p=scanner.nextInt();

                int even=0;
                for(int i=0;i<n;i++){
                        if(scanner.nextInt()%2==0){
                                even++;
                        }
                }
                int odd=n-even;

                BigDecimal e=new BigDecimal(0);
                for(int i=0;i<new BigDecimal(even).add(new BigDecimal(1)).intValue();i++){
                        e=e.add(combi(even,i));
                }

                BigDecimal o=new BigDecimal(0);
                if(p==0){
                        for(int i=0;i<odd+1;i+=2){
                                o=o.add(combi(odd,i));
                        }
                }else{
                        for(int i=1;i<odd+1;i+=2){
                                o=o.add(combi(odd,i));
                        }
                }
                System.out.println(e.multiply(o));
        }

        private static BigDecimal factorial(int i){
                BigDecimal j=new BigDecimal(1);
                while(i>1){
                        j=j.multiply(new BigDecimal(i--));
                }
                return j;
        }

        private static BigDecimal combi(int i,int j){
                return factorial(i).divide(factorial(i-j).multiply(factorial(j)));
        }
}