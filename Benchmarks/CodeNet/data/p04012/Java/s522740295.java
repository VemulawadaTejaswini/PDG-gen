import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> w_list = new ArrayList<String>();
        
        for(String c : sc.next().split("")){
            w_list.add(c);
        }
        
        Collections.sort(w_list);
        
        int ans = 1;
        for(int i=1; i<w_list.size(); i++){
            if(w_list.get(i).equals(w_list.get(i-1))){
                ans++;
            }else{
                if(ans % 2 == 0){
                    ans=1;
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}