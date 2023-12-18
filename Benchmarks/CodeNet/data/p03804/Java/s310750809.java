import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(),count,count2;
        String ans = "No";
        List<String> hList = new ArrayList<>();
        List<String> wList = new ArrayList<>();
        for (int i = 0; i < h; i++) {hList.add(sc.next());}
        for (int i = 0; i < w; i++) {wList.add(sc.next());}
        for (int i = 0; i < h-w; i++) {
            count = hList.get(i).indexOf(wList.get(0));
            if (count != -1) {
                for (int j = 1; j < w; j++) {
                    if (dfs(count, hList.get(i+j), wList.get(j))) {
                    } else {
                        break;
                    }
                    if(j == w-1) ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }
    static boolean dfs(int index,String hList,String wList){
            if(hList.indexOf(wList,index) == index) {
                return true;
            }else{
                return false;
            }
    }
}
