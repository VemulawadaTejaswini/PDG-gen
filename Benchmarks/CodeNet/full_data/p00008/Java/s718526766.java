import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        while(sc.hasNext()){
            int pattern = 0;
            int n = sc.nextInt();
            for(int i = 0;i < 10;i++){
                for(int j = 0;j < 10;j++){
                    for(int k = 0;k < 10;k++){
                        for(int l = 0;l < 10;l++){
                            if(i + j + k + l == n) pattern++;
                        }
                    }
                }
            }
            ans.add("" + pattern);
        }
        for(int i = 0,size = ans.size();i < size;i++){
            System.out.println(ans.get(i));
        }
    }
}