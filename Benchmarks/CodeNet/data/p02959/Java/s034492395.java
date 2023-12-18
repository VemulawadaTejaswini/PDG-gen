import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] cities = new int[num+1];
        int[] heroes = new int[num];
        for(int i=0;i<num+1;i++)
            cities[i]=sc.nextInt();
        for(int i=0;i<num;i++)
            heroes[i]=sc.nextInt();
        int count=0;
        int temp=0;
        for(int i=0;i<num;i++)
        {
            if(cities[i]<heroes[i])
            {
                count+=cities[i];
                temp=cities[i];
                cities[i]=0;
                if(cities[i+1]<heroes[i]-temp)
                {
                    count+=cities[i+1];
                    cities[i+1]=0;
                }
                else
                {
                    count+=heroes[i]-temp;
                    cities[i+1]-=heroes[i]-temp;
                }
            }
            else
            {
                count+=heroes[i];
                cities[i]=cities[i]-heroes[i];
            }
        }
        System.out.println(count);
    }
}