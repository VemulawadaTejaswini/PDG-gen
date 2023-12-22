import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Process {
   private String name;
   private int time;
  
   public Process(String name, int time) {
       this.name = name;
       this.time = time;
   }
  
   public int getTime() {
       return time;
   }

   public void setTime(int time) {
       this.time = time;
   }

   public String getName() {
       return name;
   }
  
  
}
public class Main {

   public static void main(String[] args) {
      
       // scanner for input.
       Scanner s = new Scanner(System.in);
       // accept number of processes.
       int numberOfProcesses = s.nextInt();
       // accept time quantum.
       int timeQuantum = s.nextInt();
      
       // declare queue for processes.
       Queue<Process> processes = new LinkedList<Process>();
      
       // fill the queue form the input.
       for (int i = 0; i<numberOfProcesses; i++) {
           String namei = s.next();
           int timei = s.nextInt();
          
           Process processi = new Process(namei, timei);
           processes.add(processi);
       }
      
       // intialize current ongoing time.
       int currTime = 0;
       // check if process(Queue) is empty
       while(!processes.isEmpty()) {
           // get the head of queue and remove from queue.
           Process p = processes.poll();
           // if the current process is greater than time quantum
           // subtract its remaining time. and add the current time.
           // add the process back to queue.
           if (p.getTime() > timeQuantum) {
               p.setTime(p.getTime() - timeQuantum);
               currTime += timeQuantum;
               processes.add(p);
           }
           // Else add the current time and display the output.
           else {
               currTime += p.getTime();
               System.out.println(p.getName() + " " + currTime);
           }
       }
   }
}
