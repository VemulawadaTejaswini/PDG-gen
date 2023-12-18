import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int[]primenumber=primenumber((int)Math.sqrt(nums[0]));
        int[]list=new int[primenumber.length];
        int put=0;
        for(int a:primenumber){
            if(nums[0]%a==0){
                list[put]=a;
                put++;
            }
        }
        int output=1;
        boolean b;
        for(int i=0;i<put;i++){
            b=true;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%list[i]!=0){
                    b=false;
                    break;
                }else{
                    
                    nums[j]/=list[i];
                }
            }
            if(b){
                output*=list[i];
                i--;
            }
        }
        System.out.println(output);
        
        
        

        
    }
        public static int[] primenumber(int n) {
        // TODO code application logic here
        int num = 1;
        int[] primeNumber = new int[n];
        for(int d:primeNumber){
            d=0;
        }
        int primeNumberCount = 0;
        while (primeNumber[primeNumber.length-1]==0) {
            if (num != 1) {
                boolean a = true;
                flag:for (int i : primeNumber) {
                    if (i != 0) {

                        if (num % i == 0) {
                            a = false;
                            break flag;
                        }
                    }
                }
                if(a){
                    
                    primeNumber[primeNumberCount]=num;
                    primeNumberCount++;
                }

            }
            num++;
        }
        return primeNumber;
//        for(int c:primeNumber){
//            System.out.println(c);
//        }


    }
}