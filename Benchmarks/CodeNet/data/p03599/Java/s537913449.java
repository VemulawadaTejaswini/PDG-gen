			double maxden = 0.;
			double limden = (double)E / (100 + E);
			int ans1 = 0;
			int ans2 = 0;
			int w = 0;
			int s = 0;

			for (int i = 0; (100 * A * i) <= F; i++) {
				w = 100 * A * i;
				for (int j = 0; (w + 100 * B * j) <= F; j++) {
					w = w + 100 * B * j;
					for (int t = 0; w + C*t <= F; t++) {
						s = C*t;
						for (int k = 0; w + s + D*k <=F; k++) {
							s = s + D*k;
							double den = 0.;
							if (w > 0) {
								den = (double) s / (w + s);
							}
							if (den > maxden && den <= limden) {
								ans1 = w + s;
								ans2 = s;
								maxden = den;
							}
						}
					}
				}
			}

			System.out.println(ans1 + " " + ans2);