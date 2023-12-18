import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 受け取り
        Scanner sc = new Scanner(System.in);
        int songCount = sc.nextInt();
        String[] songName = new String[songCount];
        int[] songLength = new int[songCount];
        
        for(int i=0;i<songCount;i++){
            songName[i] = sc.next();
            songLength[i] = sc.nextInt();
        }
        String finalSong = sc.next();
        
        // 計算
        int sleepNumber = 0;
        for(int i=0;i<songCount;i++){
            if(songName[i].equals(finalSong)){
                sleepNumber = i;
            }
        }
        
        int sleepSum = 0;
        for(int i=sleepNumber+1;i<songCount;i++){
            sleepSum += songLength[i];
        }
        System.out.println(sleepSum);
    }
}
