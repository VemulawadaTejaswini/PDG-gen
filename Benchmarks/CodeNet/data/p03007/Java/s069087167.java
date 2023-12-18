import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int cnt = 0;
        int[] num = new int[n];
        int[] num1 = new int[n];
        int[] num2 = new int[2*n];
        List<Integer> map = new ArrayList<Integer>(); 
        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
            num1[i] = num[i];
        }
        Arrays.sort(num);
        Arrays.sort(num1);
        

        for(int i = 0;i < n-1;i++){
                if(i < n-2){
                    map.add(num[i]);
                map.add(num[i+1]);
                }else{
                    map.add(num[n-1]);
                    map.add(num[i]);
                }
            cnt += 2;
            num1[i] = num[i]-num[i+1];
            num[i+1] = num1[i];
            if(i == n-2)
            ans = -1*(map.get(cnt-1) - map.get(cnt-2));
        }

        System.out.println(ans);
        for(int i = 0;i < map.size();i += 2){
            System.out.println(map.get(i)+"\t"+map.get(i+1));
        }
        
    }
}