import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        int num=Integer.parseInt(array[0]);
        int max=Integer.parseInt(array[1]);
        int[] suu = new int[num];
        int count=num;
        int min=0;
        for(int i=0;i<num;i++){
            suu[i]=sc.nextInt();
        }
      for(int j=0;j<suu.length;j++){
          max=max-suu[j];
      }
      if(max==0){
        System.out.println(num);
      }else{
          min=suu[0];
        for(int k=0;k<suu.length;k++){
            min=Math.min(min, suu[k]);
        }
        while(max>=0){
            max=max-min;
            count++;
        }
        System.out.println(count-1);
      }
    }
}