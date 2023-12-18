import java.util.*;

class Main {
    // 
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> str = new HashMap<String,Integer>();
        for(int i = 0;i < n;i++){
            String s = sc.next();
            if(str.containsKey(s)){
                int tmp = str.get(s);
                tmp++;
                str.put(s, tmp);
            }else{
                str.put(s, 1);
            }
        }
        int high = 0;
        int count = 0;
        for(int i:str.values()){
            if(high < i)high = i;
        }
        for(int i:str.values()){
            if(high == i)count++;
        }
        
        List moji = new ArrayList<String>();
        for(Map.Entry<String,Integer> entry:str.entrySet()){
            if(entry.getValue()==high){
                //System.out.println(entry.getKey());
                moji.add(entry.getKey());
            }
        }
        Collections.sort(moji);
        for(int i=0;i<moji.size();i++){
			System.out.println(moji.get(i));
		}
    }

}