import java.util.*;

public class Main
{
    static class Task
    {
        long a;
        long b;

        Task(long a, long b)
        {
            this.a = a;
            this.b = b;
        }


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        long sum = 0;
        int flag = 1;


        ArrayList<Task> taskArray = new ArrayList<Task>();

        for(int i = 0; i<n; i++)
        {
            taskArray.add(new Task(sc.nextLong(), sc.nextLong()));
        }
        taskArray.sort((task1,task2)->Long.compare(task1.b, task2.b));
        
        for( int i = 0; i<n; i++)
        {
            sum += taskArray.get(i).a;

            if(sum > taskArray.get(i).b)
            {
                flag = 0;
                break;
            }

        }

        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

