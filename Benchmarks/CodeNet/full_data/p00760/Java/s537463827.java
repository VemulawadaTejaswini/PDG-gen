mport java.util.*;
class AOJ1179{
        public static boolean judge(int y){
                if(y%3==0)      return true;
                return false;
        }
        public static int days(int y,int m,int d){
                int days = 0;
                for(int i=1;i<y;i++){
                        if(i%3==0){
                                days += 200;
                        }else{
                                days += 195;
                        }
                }
                if(y%3!=0){
                        for(int i=1;i<m;i++){
                                if(i%2==0)days+=19;
                                else days += 20;
                        }
                }else{
                        for(int i=1;i<m;i++){
                                days += 20;
                        }
                }
                days += d;
                return days;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int today = days(1000,1,1);
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                        int ans = today - days(sc.nextInt(),sc.nextInt(),sc.nextInt());
                        System.out.println(ans);
                }

        }
}