import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] charactor = "abcdefghijklmnopqrstuvwxyz".split("");
        
        ArrayList<String> s = new ArrayList<String>(Arrays.asList(sc.next().split("")));
        List<String> s_sorted = new ArrayList<String>(new HashSet<>(s));
        Collections.sort(s_sorted);
        
        int num = 0;
        for(int i=0; i<s_sorted.size(); i++){
            if(!s_sorted.get(i).equals(charactor[i])){
                System.out.println(charactor[i]);
                return;
            }
            num = i;
        }
        
        if(num == 25){
            System.out.println("None");
        }else{
            System.out.println(charactor[num+1]);
        }
    }
}