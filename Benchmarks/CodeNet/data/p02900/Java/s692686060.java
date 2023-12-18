import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> divisor = new ArrayList<>();
        for(int i = 1; i <= Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                divisor.add(i);
            }
        }
        int s = divisor.size();
        int max = 0;
        for(int i = 0; i < Math.pow(2,s); i++){
            List<Integer> one = new ArrayList<>();
            for(int j = 0; j < s; j++){
                if ((1&i>>j) == 1) {
                    int target = divisor.get(j);
                    boolean flag = true;
                    for(int k = 0; k < one.size(); k++){
                        if(gcd(one.get(k), target) != 1){flag = false;}
                    }
                    if(!flag){break;}
                    one.add(target);
                    if(flag && max < one.size()){max = one.size();}
                    
                }
            }
        }
        System.out.println(max);
    }

    public static int gcd(int a, int b){
        if(b == 0){return a;}
        return gcd(b, a%b);
    }
}
