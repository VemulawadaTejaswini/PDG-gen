import java.util.Scanner;
class Main {
    public static void main (String[] a) {
        Scanner inp = new Scanner (System.in);
        int mount_height[] = new int[10];
        for (int i=0; i<mount_height.length;i++) {
            mount_height[i] = inp.nextInt();
        }

        int max_num_1 = mount_height[0];
        int max_num_2 = mount_height[1];
        int max_num_3 = mount_height[2];
        for (int i=0;i<mount_height.length;i++) {
            if (mount_height[i] > max_num_1){
                max_num_3 = max_num_2; 
                max_num_2 = max_num_1; 
                max_num_1 = mount_height[i];
            }
            else if (mount_height[i] > max_num_2){
                max_num_3 = max_num_2; 
                max_num_2 = mount_height[i];
            }
            else if (mount_height[i] > max_num_3){
                max_num_3 = mount_height[i];
            }
        }
        
        System.out.println(max_num_1+"\n"+max_num_2+"\n"+max_num_3);

    }
}