import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int target = sc.nextInt();
            int sheet = sc.nextInt();
            if(target==0 && sheet==0) break;

            int n = 0;
            while(sheet>Math.pow(10,n+1)) n++;
            n++;

            int[] list = new int[n];
            int sheet2 = sheet;
            for(int i=n-1; i>=0; i--){
                list[i] = sheet2%10;
                sheet2 /= 10;
            }

            int max = -1;
            int part = -1;
            for(int mask=1; mask<1<<n; mask+=2){
                int sum = 0;
                int num = 0;
                for(int j=0; j<n; j++){
                    if((mask&(1<<j))>0){
                        sum += num;
                        num = list[j];
                    }else{
                        num *= 10;
                        num += list[j];
                    }
                }
                sum += num;

                if(sum==max){
                    part = -1;
                }
                if(sum>max && sum<=target){
                    max = sum;
                    part = mask;
                }

            }

            if(max==-1) System.out.println("error");
            else if(part==-1) System.out.println("rejected");
            else{
                System.out.print(max);
                int num = -1;
                for(int i=0; i<n; i++){
                    if((part&(1<<i))>0){
                        if(num!=-1) System.out.print(" "+num);
                        num = list[i];
                    }else{
                        num *= 10;
                        num += list[i];
                    }
                }
                System.out.println(" "+num);
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}