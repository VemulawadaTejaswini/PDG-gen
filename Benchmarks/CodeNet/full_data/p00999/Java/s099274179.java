import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a, b, c, d, e;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			if(a+b+c+d+e==0)
				break;
			int na, nb, nc;
			na = sc.nextInt();
			nb = sc.nextInt();
			nc = sc.nextInt();

			int res;
			res = 1000000100;
			for(int i = 0; i <= na + nb + nc; i++) {
				if(i < nc) {
					if(i < d)
						res = Math.min(res, Math.min(i * c, d * e) + c * (nc-i) + b * nb + a * na);
					else
						res = Math.min(res, Math.min(i * c, i * e) + c * (nc-i) + b * nb + a * na);
				}
				else if(i < nc + nb) {
					if(i < d)
						res = Math.min(res, Math.min(nc * c + (i-nc) * b, d * e) + b * (nb -i+nc) + a * na);
					else
						res = Math.min(res, Math.min(nc * c + (i-nc) * b, i * e) + b * (nb -i+nc) + a * na);
				}
				else {
					if(i < d)
						res = Math.min(res, Math.min(nc * c + nb * b + (i-nc-nb) * a, d * e) + a * (na-i+nb+nc));
					else
						res = Math.min(res, Math.min(nc * c + nb * b + (i-nc-nb) * a, i * e) + a * (na-i+nb+nc));
				}
			}
			System.out.println(res);
		}
	}
}