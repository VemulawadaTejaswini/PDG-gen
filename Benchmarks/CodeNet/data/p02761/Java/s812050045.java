import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        int dataNum = sc.nextInt();

        List<Integer> digitData = new ArrayList<>();
        List<Integer> intData = new ArrayList<>();

        for(int i = 0; i < dataNum * 2; i++){
            int whatInt = sc.nextInt();
            if(i % 2 == 0) digitData.add(whatInt);
            else intData.add(whatInt);
        }

        List<Integer> dupDigit = new ArrayList<>();

        
        for(int j = 0; j < digitData.size() - 1; j++){

            if(digitData.get(j) > digit){
                System.out.println(-1);
                System.exit(0);
            }

            if(digit != 1 && digitData.get(j) == 1 && intData.get(j) == 0){
                System.out.println(-1);
                System.exit(0);
            }

            for(int jj = 1; jj < dataNum; jj++){
                if(digitData.get(j) == digitData.get(jj)){
                    if(intData.get(j) != intData.get(jj)){
                        System.out.println(-1);
                        System.exit(0);
                    }else{
                        digitData.remove(jj);
                        intData.remove(jj);
                    }
                }
            }
        }

        int ans = 0;

        for(int ii = 0; ii < digitData.size(); ii++){
            ans += intData.get(ii) * 10 ^(digit - digitData.get(ii));
        }
        System.out.println(ans);
    }
}