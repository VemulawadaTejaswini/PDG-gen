import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int limit = Integer.parseInt(values[1]);

        Queue<Process> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Process(scanner.nextLine().split(" ")));
        }

        int elapsedTime = 0;
        while (!queue.isEmpty()) {
            Process process = queue.poll();
            int processTime = Math.min(process.reamingTime, limit);
            process.reamingTime -= processTime;
            elapsedTime += processTime;
            if (process.reamingTime == 0) {
                System.out.println(process.processName + " " + Integer.toString(elapsedTime));
            } else {
                queue.add(process);
            }
        }

    }

    private static class Process {
        String processName;
        int reamingTime;

        Process(String[] data) {
            processName = data[0];
            reamingTime = Integer.parseInt(data[1]);
        }

    }
}

