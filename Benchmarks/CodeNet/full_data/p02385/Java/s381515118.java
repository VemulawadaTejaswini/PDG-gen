import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String d1, d2, d3, d4, d5, d6;
        d1 = scn.next();
        d2 = scn.next();
        d3 = scn.next();
        d4 = scn.next();
        d5 = scn.next();
        d6 = scn.next();

        String c1, c2, c3, c4, c5, c6;
        c1 = scn.next();
        c2 = scn.next();
        c3 = scn.next();
        c4 = scn.next();
        c5 = scn.next();
        c6 = scn.next();

        if (c1.equals(d1)&&c6.equals(d6)) {
            String cube = d2 + d3 + d5 + d4;
            cube = cube + cube;
            String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (c1.equals(d6)&&c6.equals(d1)) {
            String cube = d4 + d5 + d3 + d2;
            cube = cube + cube;
             String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (c1.equals(d2)&&c6.equals(d5)) {
            String cube = d4 + d6 + d3 + d1;
            cube = cube + cube;
            String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (c1.equals(d5)&&c6.equals(d2)) {
            String cube = d1 + d3 + d6 + d4;
            cube = cube + cube;
            String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (c1.equals(d3)&&c6.equals(d4)) {
            String cube = d1 + d2 + d6 + d5;
            cube = cube + cube;
            String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (c1.equals(d4)&&c6.equals(d3)) {
            String cube = d5 + d6 + d2 + d1;
            cube = cube + cube;
            String check = c2 + c3 + c5 + c4;
            if(cube.contains(check)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else{
            System.out.println("No");
        }



        scn.close();

    }


}

