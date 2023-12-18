import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num_student=scan.nextInt();
        int num_point=scan.nextInt();
        int[] stu_x=new int[num_student];
        int[] stu_y=new int[num_student];
        int[] P_x=new int[num_point];
        int[] P_y=new int[num_point];
        int i;
        for(i=0;i<num_student;i++){
            stu_x[i]=scan.nextInt();
            stu_y[i]=scan.nextInt();
        }
        for(i=0;i<num_point;i++){
            P_x[i]=scan.nextInt();
            P_y[i]=scan.nextInt();
        }
        int min;
        int mindistance;
        int j;

        for(i=0;i<num_student;i++){
            mindistance=100000000;
            min=-1;
            for(j=0;j<num_point;j++){
                if(mindistance>Math.abs(stu_x[i]-P_x[j])+Math.abs(stu_y[i]-P_y[j])){
                    mindistance=Math.abs(stu_x[i]-P_x[j])+Math.abs(stu_y[i]-P_y[j]);
                    min=j+1;
                }
            }
            System.out.println(min);
        }

    }
}