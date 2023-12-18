import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        int numberOfSubmissions = scanner.nextInt();

        Set<Integer> successfullySubmittedTasks = new HashSet<>();

        int currentTask = 0;
        boolean taskIsDone = false;
        int failsCounter = 0;
        int currentTaskFailsCounter = 0;
        for (int i = 0; i < numberOfSubmissions; i++) {
            int task = scanner.nextInt();
            String submissionStatus = scanner.next();

            if (currentTask != task) {
                currentTask = task;
                if (taskIsDone) {
                    failsCounter += currentTaskFailsCounter;
                }
                currentTaskFailsCounter = 0;
                taskIsDone = false;
            }
            if (submissionStatus.equals("WA") && !taskIsDone) {
                currentTaskFailsCounter++;
            }
            if (submissionStatus.equals("AC")) {
                successfullySubmittedTasks.add(task);
                taskIsDone = true;
            }
        }
        if (taskIsDone) {
            failsCounter += currentTaskFailsCounter;
        }
        System.out.println(successfullySubmittedTasks.size() + " " + failsCounter);
    }
}