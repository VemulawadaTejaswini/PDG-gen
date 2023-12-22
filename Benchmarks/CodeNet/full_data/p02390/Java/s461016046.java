import static java.lang.System.out;
    public class Main {
        public static void main(String[] args){
            int time = new java.util.Scanner(System.in).nextInt();

            int hour = time / 3600;
            int minute = (time % 3600) / 60;
            int second = (time % 3600) % 60;
            out.print(hour + ":");
            out.print(minute + ":");
            out.println(second);
    
        }
    }