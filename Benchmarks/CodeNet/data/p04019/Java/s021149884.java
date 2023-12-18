/*
 * Copyright © 2016. Throput Limited. All rights reserved.
 * Unless otherwise indicated, this file is subject to the 
 * terms and conditions specified in the 'LICENSE.txt' file,
 * which is part of this source code package.
 */

import java.util.*;

/**
 *
 * @author thomaslee
 */
public class WannaGoBackHome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dirs = sc.next();
        int e = 0;
        int s = 0;
        int w = 0;
        int n = 0;
        for (char dir : dirs.toCharArray()) {
            switch (dir) {
                case 'E':
                    e++;
                    break;
                case 'S':
                    s++;
                    break;
                case 'W':
                    w++;
                    break;
                case 'N':
                    n++;
                    break;
                default:
                    System.out.println("No");
                    System.exit(0);
            }
            if (e > 1 && s > 1 && w > 1 && n > 1) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}
