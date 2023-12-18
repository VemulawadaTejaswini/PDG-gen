import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int[][] nums=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<h;i++){
            for(int j=0;j<w-1;j++){
                if(nums[i][j]%2==1){
                    nums[i][j]--;
                    nums[i][j+1]++;
                    int[] tmp={i,j,i,j+1};
                    ans.add(tmp);
                }
            }
        }
        for(int i=0;i<h-1;i++){
            if(nums[i][w-1]%2==1){
                nums[i][w-1]--;
                nums[i+1][w-1]++;
                int[] tmp={i,w-1,i+1,w-1};
                ans.add(tmp);
            }
        }
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            for(int a:ans.get(i)){
                System.out.print(a+1+" ");
            }
            System.out.println();
        }

    }
}
