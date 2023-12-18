import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int a[] = new int[n];

        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) a.add(sc.nextInt());

//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

//        List<Integer> start = new ArrayList<>(n);

        int zero = 0;

        int other_count = 1;

        List<Integer> other = new ArrayList<>();

        for (int i=0; i<n; i++){
            if (a.get(i)==0) zero++;
            else other.add(a.get(i));
        }

        for (int i=0; i<other.size()-1; i++){
            if (other.get(i)==other.get(i+1)){
                other_count++;
            }
        }

        a.sort((s1, s2) -> s1.compareTo(s2));

        int count1 =0;
        int count2 =0;
        int count3 =0;

        for (int i=0; i<n/3-1; i++){
            if (a.get(i)==a.get(i+1)){
                count1++;
            }
        }
        for (int i=n/3; i<n*2/3-1; i++){
            if (a.get(i)==a.get(i+1)){
                count2++;
            }
        }

        for (int i=n*2/3; i<n-1; i++){
            if (a.get(i)==a.get(i+1)){
                count3++;
            }
        }

        int first = a.get(0);
        int second = a.get(n/3);
        int third = a.get(n*2/3);


        if (zero==n){
//            if (Arrays.asList(a).())
            System.out.println("Yes");

        }else {
            if (n%3!=0)System.out.println("No");
            else{
                if((zero==n/3) && (other_count==(n*2)/3)){
                    System.out.println("Yes");
                }else if ((first^third)==second && (second^first)==third && (third^second)==first &&(count1==count2) && (count2==count3)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }




//
//        else if((zero==n/3) && (other_count==(n*2)/3)){
//            System.out.println("Yes");
//        }else if ((first^third)==second && (second^first)==third && (third^second)==first &&(count1==count2) && (count2==count3)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

//        else{

//            if (a.length % 3 != 0) {
//                System.out.println("No");
//            }
//            else {
//                long count = 0;
//                int i = 0;
//                if (a.length == 3) {
//                    if ((a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0]))
//                        System.out.println("Yes");
//                    else System.out.println("No");
//                } else if ((a.length > 3) && (a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0])) {
//                    while (i < n - 5) {
//                        if ((a[i] == a[i + 3]) && (a[i + 1] == a[i + 4]) && (a[i + 2] == a[i + 5])) {
//                            count++;
//                            i += 3;
//                        } else break;
//                    }
//                    if (count == (n / 3 - 1)) {
//                        System.out.println("Yes");
//                    } else {
//                        System.out.println("No");
//                    }
//
//                } else {
//                    System.out.println("No");
//                }
//            }
            }
        }

