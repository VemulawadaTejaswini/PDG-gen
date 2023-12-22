import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    enum StepAction {
        LeftUp,
        LeftDown,
        RightUp,
        RightDown,
    }

    public static void main(String[] args) {
        List<Activity> problem = read();
        problem.stream().map(p -> p.count).forEach(System.out::println);
    }

    static List<Activity> read() {
        List<Activity> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            int length = Integer.parseInt(sc.nextLine());
            if(length == 0) {
                break;
            }
            list.add(new Activity(sc.nextLine()));
        }
        return list;
    }

    enum State {
        Down,
        LeftUp,
        RightUp,
        Up
    }

    static class Activity {
        private List<StepAction> list = new ArrayList<>();

        private State state = State.Down;
        private boolean up = false;

        final int count;

        private void process(StepAction action) {
        }

        private int count() {
            list.forEach(this::process);
            return 0;
        }

        public Activity(String line) {
            String[] arr = line.split(" ");
            for(String action: arr) {
                switch (action) {
                    case "lu":
                        list.add(StepAction.LeftUp);
                        break;
                    case "ld":
                        list.add(StepAction.LeftDown);
                        break;
                    case "ru":
                        list.add(StepAction.RightUp);
                        break;
                    case "rd":
                        list.add(StepAction.RightDown);
                        break;
                }
            }
            this.count = count();
        }
    }

}

