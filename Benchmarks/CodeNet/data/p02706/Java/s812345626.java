import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        int vacation = scanner.nextInt();
        int homeworkNumber = scanner.nextInt();
        int studyDay = 0;
 
        for (int i = 0; i < homeworkNumber; i++) {
            studyDay += scanner.nextInt();
        }
 
        int playable;
      
        playable = vacation - studyDay;
 
        if (playable >= 0) {
            
            System.out.println(playable);
        } else {
            System.out.println("-1");
        }
 
        scanner.close();
 
    }
 
}